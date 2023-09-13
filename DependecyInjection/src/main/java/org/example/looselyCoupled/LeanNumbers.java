package org.example.looselyCoupled;

import javax.enterprise.inject.Alternative;
import java.util.Random;

@Alternative
public class LeanNumbers implements IGenerateNumbers{
    @Override
    public String titleNumber(String titleNUmber) {
        return null;
    }

    @Override
    public String titleISBNNumber(String TitleISBNNumber) {
        return null;
    }

    @Override
    public String titleBookNumber(String titleBookNumber) {
        return null;
    }
}
