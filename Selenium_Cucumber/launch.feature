@tag
Feature: Working on adactine application

  @tag1
  Scenario: Using all the operation on application
    Given User Performs Login in adactin application
      | UserName    | Password   |
      | Chandan2011 | chandan@20 |
    And User searches for the hotel
      | Location          | London      |
      | Hotels            | Hotel Creek |
      | RoomType          | Double      |
      | NumberOfRooms     | 2 - Two     |
      | Datepick_in       | 17/07/2019  |
      | Datepick_out      | 20/07/2019  |
      | Adults_Per_Room   | 3 - Three   |
      | Children_Per_Room | 1 - One     |
    When User validates and select the required hotel
      | Location      | London      |
      | Hotels        | Hotel Creek |
      | RoomType      | Double      |
      | NumberOfRooms | 2 - Two     |
      | Datepick_in   | 17/07/2019  |
      | Datepick_out  | 20/07/2019  |
    And User does hotel booking by giving required inputs
      | Fname     | Chandan          |
      | Lname     | Patni            |
      | Address   | Ajmer,Rajasthan  |
      | ccNum     | 1234567890123456 |
      | ccType    | VISA             |
      | Exp_month | July             |
      | Exp_year  |             2022 |
      | cvv       |              654 |
    And User navigate to booking confirmation page
    And User selects my itinery
    Then User cancels the booking
