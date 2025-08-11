package com.mobility;

public class Transportation {
	    public static void main(String[] args) {
	        Vehicle[] fleet = {new Car(),new Bike(),new Bus()};
	        for (Vehicle v : fleet) {
	            v.move();
	        }
	    }
	}

