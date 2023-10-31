/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import common.Algorithm;
import common.Library;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ManageCoppyFile extends Menu<String>{

    static Scanner sc = new Scanner(System.in);

    static String[] mc = {"coppy", "exit"};

    protected Library library;
    protected Algorithm al;

    public ManageCoppyFile() {
        super("============ Coppy Program =========", mc);
        library = new Library();
        al = new Algorithm();
    }

    @Override
    public void execute() {
        al.readFileConfig();
    }
}