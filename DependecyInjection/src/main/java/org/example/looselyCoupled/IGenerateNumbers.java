package org.example.looselyCoupled;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Named;
@Alternative
public interface IGenerateNumbers {
    String titleNumber(String titleNUmber);
    String titleISBNNumber(String TitleISBNNumber);
    String titleBookNumber(String titleBookNumber);

}
