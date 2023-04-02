package com.javaworks;

public class Player2 extends Player1 {
    private Boolean armour;

    public Player2(String name, String weapon, int health, Boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.setHealth(this.getHealth()-20);
            if (this.getHealth() <= 0) this.setHealth(0);
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20." +
                    "New health is " + this.getHealth());
            if (this.getHealth() == 0) {
                System.out.println(getName() + " is dead");
        }
        if (!armour) {
            super.damageByGun1();
        }
    }}

    @Override
    public void damageByGun2() {
        if (armour) {
            this.setHealth(this.getHealth()-40);
            if (this.getHealth() <= 0) this.setHealth(0);
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 40." +
                    "New health is " + this.getHealth());
            if (this.getHealth() == 0) {
                System.out.println(getName() + " is dead");
        }
        if (!armour) {
            super.damageByGun2();
        }
    }
}}
