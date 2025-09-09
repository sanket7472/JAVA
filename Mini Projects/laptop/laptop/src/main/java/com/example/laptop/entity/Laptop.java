package com.example.laptop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="laptop_table")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String model;

    @Column
    private  long imei_no;

    @Column
    private String brand;

    @Column
    private double price;

    @Column
    private int ram;

   @Column
    private int rom;

    public Laptop() {
    }

    public Laptop(String brand,String model, long imei_no,  double price, int ram, int rom) {
        this.model = model;
        this.imei_no = imei_no;
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.rom = rom;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getImei_no() {
        return imei_no;
    }

    public void setImei_no(int imei_no) {
        this.imei_no = imei_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", imei_no=" + imei_no +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                ", rom=" + rom +
                '}';
    }
}
