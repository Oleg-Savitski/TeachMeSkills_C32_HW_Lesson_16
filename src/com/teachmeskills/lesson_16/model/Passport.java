package com.teachmeskills.lesson_16.model;

import java.util.Objects;

public class Passport {

        private final String series;
        private final String number;
        private final String fullPassportNumber;

        public Passport(String series, String number) {
            this.series = series;
            this.number = number;
            this.fullPassportNumber = series + " № " + number;
        }

        public static Passport create(String series, String number) {
            return new Passport(series, number);
        }


        public String getFullPassportNumber() {
            return fullPassportNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Passport passport = (Passport) o;
            return Objects.equals(series, passport.series) &&
                    Objects.equals(number, passport.number);
        }

        @Override
        public int hashCode() {
            return Objects.hash(series, number);
        }

        @Override
        public String toString() {
        return fullPassportNumber;
        }
}