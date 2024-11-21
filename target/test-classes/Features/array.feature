@Array
Feature: Array

  Background: Steps for each scenario
    Given User is on Login Page of portal
    When User enter valid username "Test_01" and password "Sdet@2025"
    Then User is redirected to Home Page

  @Array_Test01
  Scenario: User is able to navigate to "Array" page
    Given User is logged in to Home Page
    When User clicks Get Started button under Array
    Then User should be redirected to the "Array" page
    
  @Array_Test02
  Scenario Outline: User is able to navigate to page <Options>
  Given User is on the Array page
  When User clicks link from the list of topics covered "<Options>"
  Then User should be redirected to respective page of "<destinationUrl>"
  Examples:
  |Options|                    destinationUrl|
  |Arrays in Python|           https://dsportalapp.herokuapp.com/array/arrays-in-python/|
  |Arrays using List|          https://dsportalapp.herokuapp.com/array/arrays-using-list/|
  |Basic Operations in Lists|  https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/|
  |Applications of Array|      https://dsportalapp.herokuapp.com/array/applications-of-array/|
  
  @Array_Test03
  Scenario Outline: User is able to navigate to TryEditor page of <Options> to verify code in python
  Given User is on the particular page "<Options>"
  When User clicks on Try Here button of page "<Options>"
  Then User should be redirected to TryEditor page having Run button
  Examples:
  |Options|
  |Arrays in Python|
  |Arrays using List|
  |Basic Operations in Lists|
  |Applications of Array|
  
  @Array_Test04
  Scenario Outline: Verify the tryEditor functionality is working in "Arrays in Python"
  Given User is on the tryEditor page of Array with Run button
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the console
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       1|
  
  @Array_Test05
  Scenario Outline: Verify the tryEditor functionality is working in "Arrays Using List"
  Given User is on the tryEditor page of Array with Run button
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the console
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       1|
  
  @Array_Test06
  Scenario Outline: Verify the tryEditor functionality is working in "Basic Operations in List"
  Given User is on the tryEditor page of Array with Run button
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the console
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       1|
  
  @Array_Test07
  Scenario Outline: Verify the tryEditor functionality is working in "Applications of Array"
  Given User is on the tryEditor page of Array with Run button
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the console
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       1|
  
  @Array_Test08
  Scenario Outline: Verify the tryEditor functionality is working in "Arrays in Python" in negative test
  Given User is on the tryEditor page of Array with Run button
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       0|
  
  @Array_Test09
  Scenario Outline: Verify the tryEditor functionality is working in "Arrays Using List" in negative test
  Given User is on the tryEditor page of Array with Run button
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       0|
  
  @Array_Test09
  Scenario Outline: Verify the tryEditor functionality is working in "Basic Operations in Lists" in negative test
  Given User is on the tryEditor page of Array with Run button
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       0|
  
  @Array_Test10
  Scenario Outline: Verify the tryEditor functionality is working in "Applications of Array" in negative test
  Given User is on the tryEditor page of Array with Run button
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window
  Examples:
  |Sheet|          RowNumber|
  |dsalgocode|       0|
  
  @Array_Test11
  Scenario Outline: User is able to navigate to question page of <Questions>
  Given User is on Array Practice Questions page
  When User clicks link from the list "<Questions>"
  Then User should be redirected to "<URL>" page having a question, tryEditor with Run and Submit buttons
  Examples:
  |Questions|                                   URL|
  |Search the array|                            https://dsportalapp.herokuapp.com/question/1|
  |Max Consecutive Ones|                        https://dsportalapp.herokuapp.com/question/2|
  |Find Numbers with Even Number of Digits|     https://dsportalapp.herokuapp.com/question/3|
  |Squares of  a Sorted Array|                  https://dsportalapp.herokuapp.com/question/4|

  @Array_Test12
  Scenario Outline: Verify the tryEditor functionality is working in "Search the Array" practice editor page
  Given User is on the "Search the array" practice editor page
  When User writes the valid code in practice editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the practice console                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      2   |
  
  @Array_Test13
  Scenario Outline: Verify the tryEditor functionality is working in "Max Consecutive Ones" practice editor page
  Given User is on the "Max Consecutive Ones" practice editor page
  When User writes the valid code in practice editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the practice console                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      3   |
  
  @Array_Test14
  Scenario Outline: Verify the tryEditor functionality is working in "Find Numbers with Even Number of Digits" practice editor page
  Given User is on the "Find Numbers with Even Number of Digits" practice editor page
  When User writes the valid code in practice editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the practice console                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      4   |
  
  @Array_Test15
  Scenario Outline: Verify the tryEditor functionality is working in "Squares of  a Sorted Array" practice editor page
  Given User is on the "Squares of  a Sorted Array" practice editor page
  When User writes the valid code in practice editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see correct output in the practice console                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      5   |
  
  @Array_Test16
  Scenario Outline: Verify the tryEditor functionality is working in "Search the Array" practice editor page when submit button is clicked
  Given User is on the "Search the Array" practice editor page
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Submit button
  Then User should be able to see correct output on submission                                                             
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      2   |
  
  @Array_Test17
  Scenario Outline: Verify the tryEditor functionality is working in "Max Consecutive Ones" practice editor page when submit button is clicked
  Given User is on the "Max Consecutive Ones" practice editor page
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Submit button
  Then User should be able to see correct output on submission                                                             
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      3   |
  
  @Array_Test18
  Scenario Outline: Verify the tryEditor functionality is working in "Find Numbers with Even Number of Digits" practice editor page when submit button is clicked
  Given User is on the "Find Numbers with Even Number of Digits" practice editor page
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Submit button
  Then User should be able to see correct output on submission                                                             
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      4   |
  
  @Array_Test19
  Scenario Outline: Verify the tryEditor functionality is working in "Squares of  a Sorted Array" practice editor page when submit button is clicked
  Given User is on the "Squares of  a Sorted Array" practice editor page
  When User writes the valid code in editor from "<Sheet>" and <RowNumber> and click Submit button
  Then User should be able to see correct output on submission                                                             
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      5   |
  
  @Array_Test20
  Scenario Outline: Verify the tryEditor functionality is working in "Search the Array" practice editor page in negative test
  Given User is on the "Search the array" practice editor page
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      0   |
  
  @Array_Test21
  Scenario Outline: Verify the tryEditor functionality is working in "Max Consecutive Ones" practice editor page in negative test
  Given User is on the "Max Consecutive Ones" practice editor page
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      0   |
  
  @Array_Test22
  Scenario Outline: Verify the tryEditor functionality is working in "Find Numbers with Even Number of Digits" practice editor page in negative test
  Given User is on the "Find Numbers with Even Number of Digits" practice editor page
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      0   |
  
  @Array_Test23
  Scenario Outline: Verify the tryEditor functionality is working in "Squares of  a Sorted Array" practice editor page in negative test
  Given User is on the "Squares of  a Sorted Array" practice editor page
  When User writes the invalid code in editor from "<Sheet>" and <RowNumber> and click Run button
  Then User should be able to see error message in alert window                                                              
  Examples: 
  | Sheet|         RowNumber |
  | dsalgocode|      0   |
   
  @Array_Test24
  Scenario: User is able to navigate to Arrays Practice Questions page
  Given User is on the Applications of Array page
  When User clicks Array Practice Questions link
  Then User is redirected to practice page having 5 links
   


