package org.example.BaeldungApproach;

import javax.enterprise.inject.Alternative;

@Alternative
public class PngFileEditor implements ImageFileEditor{
    @Override
    public String openFile(String fileName) {
        return null;
    }

    @Override
    public String editFile(String fileName) {
        return null;
    }

    @Override
    public String writeFile(String fileName) {
        return null;
    }

    @Override
    public String saveFile(String fileName) {
        return null;
    }
}
