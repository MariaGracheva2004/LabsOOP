package service.impl;

import colors.Color;
import service.ShapesService;
import shapes.*;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesServiceImpl implements ShapesService
{


    public double getSquares(List<Shape> shapeList)
    {
        double sum=0;
        for(int i=0; i<shapeList.size(); i++)
        {
            sum=sum+shapeList.get(i).getarea();
        }

        return sum;

    }

    public double getMaxPerimeters(List<Shape> shapeList)
    {
        double MaxPerimeter = shapeList.get(0).getperimeter();
        for (int i = 1; i < shapeList.size(); i++)
        {
            if (shapeList.get(i).getperimeter() > MaxPerimeter)
            {
                MaxPerimeter = shapeList.get(i).getperimeter();
            }
        }
        return MaxPerimeter;
    }

    public Set<Color> getColors(List<Shape> shapeList)
    {
        Set<Color> allColors = new HashSet<>();
        for(int i = 0; i < shapeList.size(); i++)
        {
            allColors.add(shapeList.get(i).getcolor());
        }
        return allColors;
    }






}