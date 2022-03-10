@stories
Feature: Emiratesr
  the user tries to enter the Fly Emirates platform


  Scenario: search for an available flight path
    Given than gabriel go directly to the page he will try to find an available flight for your trip
      | strOrigen | strDestino | fechasalida  | fechallegada |
      | Abiyan    | Adis abeba | 06/02/2022   | 13/03/2022   |

    When he enters the destination and departure information of his trip, it will show him available options.
    Then if there is a ticket available for his trip gabriel can select it