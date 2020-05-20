/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.pluginsapplication;

import com.ace.pluginsapplication.interfaces.IShape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teo
 */
public class Subject
{
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o)
    {
        observers.add(o);
    }

    public int getState()
    {
        return state;
    }

    public void setState(int value, IShape shape)
    {
        this.state = value;
        execute(shape);
    }

    private void execute(IShape shape)
    {
        for (Observer observer : observers)
        {
            observer.update(shape);
        }
    }
}
