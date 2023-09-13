package org.example.BaeldungApproach;

import javax.enterprise.inject.Default;
import javax.inject.Named;

@Named("ImageFileEditor")
public interface ImageFileEditor {
        String openFile(String fileName);
        String editFile(String fileName);
        String writeFile(String fileName);
        String saveFile(String fileName);
}
