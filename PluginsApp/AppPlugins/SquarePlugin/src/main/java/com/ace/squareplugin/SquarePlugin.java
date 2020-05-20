/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ace.squareplugin;
import com.ace.pluginsapplication.interfaces.IPluginsAppPlugin;
import com.ace.pluginsapplication.interfaces.IShape;
/**
 *
 * @author Teo
 */
public class SquarePlugin implements IPluginsAppPlugin
{
    @Override
    public String getUniqueNameText()
    {
        return "SquarePlugin";
    }

    @Override
    public String getDisplayText()
    {
        return "Square";
    }

    @Override
    public IShape getShape()
    {
        return new Square();
    }
}
