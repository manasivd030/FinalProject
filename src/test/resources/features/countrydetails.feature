Feature: Testing Country Service

  Scenario Outline: Get Country by Alpha Code and name
    When I make a request to get the country <country> alphacode <alphacode>
    Then the status code should be <statusCode>
    Then the country should be <expectedCountry>

    Examples:
    | country | alphacode | statusCode | expectedcountry |
    | India   | IN        | 200        | India         |
    | Norway  | NO        | 200        | Norway        |
    
    Scenario Outline: Get Calling code using currency
    When I make a request to get the currency <currency>
    Then the calling code should be callingcode <callingcode>
    
    Examples:
    | currency | callingcode|
    | inr | 356 |
    | cop | 170 |
    
