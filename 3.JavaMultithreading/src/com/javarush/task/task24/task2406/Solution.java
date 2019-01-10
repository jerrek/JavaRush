package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Наследование от внутреннего класса
*/
class Solution {

    class Building {

        class Hall {

            private final BigDecimal square;

            Hall(BigDecimal square) {
                this.square = square;
            }
        }

        class Apartments {

        }

    }

    public class Apt3Bedroom extends Building.Apartments {

        Apt3Bedroom(Building building) {
            building.super();
        }
    }

    public class BigHall extends Building.Hall {

        BigHall(Building building, BigDecimal square) {
            building.super(square);
        }
    }

}
