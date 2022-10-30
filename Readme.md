# Restaurant Management System

## Roles

Manager portal
- add dishes and their details
- manage tables
- can see the daily total revenue
- can manage the inventory
- can view the details of venders

customer portal
- can see the menu online
- can order the items
- can view the bill

chef portal
- can view the dishes
- can ask for when inventory is low

## Problem Statement

create a class Menu
- create a function Display_menu that calls the menu GUI
- create a GUI menu with different categories
- create a function Add_item (Name, Price, Category)

create a class Table
- inherit from class Menu
- create a function Add_table
- create a function Add_tip
- create a function Add_dish_to_table
- create a function Total_bill that displays the total bill for that table

create a class Inventory
- create a list of raw materials
- create a function Add_raw_material
- create a function Check_raw_materials
- create a function Order_raw_materials that have the details of the vendor
 
create a class chef
- inherit from class table
- create a function View_order that shows the order with table number 
- create a function Raw_material_insufficient
 
create a class revenue
- inherit from class Table
- create a function Total_tip
- create a function Total_revenue_collected

create a class manager
- inherit from classes Menu, Inventory, Table, Revenue
- create a function Login
