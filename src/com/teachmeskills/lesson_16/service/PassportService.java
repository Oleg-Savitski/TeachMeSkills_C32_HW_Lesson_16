package com.teachmeskills.lesson_16.service;

import com.teachmeskills.lesson_16.model.Passport;

import java.util.HashSet;
import java.util.Set;

public class PassportService {

    public Set<Passport> generatePassports() {
        Set<Passport> passports = new HashSet<>();
        passports.add(Passport.create("MP", "6789014"));
        passports.add(Passport.create("BA", "2345674"));
        passports.add(Passport.create("CV", "3456782"));
        passports.add(Passport.create("MA", "4567891"));
        passports.add(Passport.create("HI", "5678903"));
        passports.add(Passport.create("II", "7765443"));
        passports.add(Passport.create("MI", "5546634"));
        passports.add(Passport.create("LI", "1109900"));
        passports.add(Passport.create("HD", "2232223"));
        passports.add(Passport.create("LM", "1009900"));
        passports.add(Passport.create("TT", "2121233"));
        passports.add(Passport.create("RA", "8990989"));
        passports.add(Passport.create("CC", "2366540"));
        passports.add(Passport.create("SA", "8723461"));
        passports.add(Passport.create("VB", "9008871"));

        return passports;
    }
}