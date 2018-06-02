package com.bijay.jsonparsingwithretrofit;

/**
 * Created by Bijay on 6/2/2018.
 */

public class MenuModalClass
{
    private String Update_Date;

    private String Item_Desc;

    private String Item_Price;

    private String Image;

    private String Item_Desc_English;

    private String Id;

    private String Item_Name;

    private String Menu_Type;

    public String getUpdate_Date ()
    {
        return Update_Date;
    }

    public void setUpdate_Date (String Update_Date)
    {
        this.Update_Date = Update_Date;
    }

    public String getItem_Desc ()
    {
        return Item_Desc;
    }

    public void setItem_Desc (String Item_Desc)
    {
        this.Item_Desc = Item_Desc;
    }

    public String getItem_Price ()
    {
        return Item_Price;
    }

    public void setItem_Price (String Item_Price)
    {
        this.Item_Price = Item_Price;
    }

    public String getImage ()
    {
        return Image;
    }

    public void setImage (String Image)
    {
        this.Image = Image;
    }

    public String getItem_Desc_English ()
    {
        return Item_Desc_English;
    }

    public void setItem_Desc_English (String Item_Desc_English)
    {
        this.Item_Desc_English = Item_Desc_English;
    }

    public String getId ()
    {
        return Id;
    }

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public String getItem_Name ()
    {
        return Item_Name;
    }

    public void setItem_Name (String Item_Name)
    {
        this.Item_Name = Item_Name;
    }

    public String getMenu_Type ()
    {
        return Menu_Type;
    }

    public void setMenu_Type (String Menu_Type)
    {
        this.Menu_Type = Menu_Type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Update_Date = "+Update_Date+", Item_Desc = "+Item_Desc+", Item_Price = "+Item_Price+", Image = "+Image+", Item_Desc_English = "+Item_Desc_English+", Id = "+Id+", Item_Name = "+Item_Name+", Menu_Type = "+Menu_Type+"]";
    }
}


