package org.example.tightlyCoupledClasses;

import org.example.looselyCoupled.*;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Here there is tightly couple presented because this class only can create isbn number.
 * This decrease reusability.
 * Development Speed
 * Code Quality
 * Code readability
 */

public class BookService {

//  @Inject
//  private IGenerateNumbers iGenerateNumbers;
//
//  @Inject
//  public BookService(IGenerateNumbers iGenerateNumbers) {
//    this.iGenerateNumbers = iGenerateNumbers;
//  }
//
//  public String writeTitleNumber(String titleNUmber){
//      return iGenerateNumbers.titleNumber(titleNUmber);
//    }


}
