package javaFunctionalProramming;

import java.util.ArrayList;
import java.util.List;

public class DeclarativeApproach {

    public static void main(String[] args) {

        List<Computers> compu =  List.of(
                new Computers(4,800,Branch.CORADIR),
                new Computers(1,500,Branch.MAC),
                new Computers(4,120,Branch.MAC),
                new Computers(8,120,Branch.DELL),
                new Computers(16,320,Branch.BANGHO),
                new Computers(16,120,Branch.BANGHO),
                new Computers(4,400,Branch.DELL),
                new Computers(4,800,Branch.BANGHO),
                new Computers(4,800,Branch.LENOVO)


        );

        compu.stream()
                .filter(equipment ->Branch.BANGHO
                        .equals(equipment.branch)).forEach(System.out::println);


    }

    static class Computers {
        private int Ram;
        private int Rom;
        private Branch branch;

        public Computers(int ram, int rom, Branch branch) {
            Ram = ram;
            Rom = rom;
            this.branch = branch;
        }

        @Override
        public String toString() {
            return "Computers{" +
                    "Ram=" + Ram +
                    ", Rom=" + Rom +
                    ", branch=" + branch +
                    '}';
        }
    }

    enum Branch {
        MAC, DELL, LENOVO, BANGHO, CORADIR
    }

}
