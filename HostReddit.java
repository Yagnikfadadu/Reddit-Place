import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HostReddit extends Frame implements ActionListener
{
    Button[] buttons = new Button[2400];
    MenuBar menuBar;
    Menu menu;
    MenuItem red,green,blue,gray,cyan,orange,white,skin,black;
    Button test1,test2;
    TextArea textArea;
    Panel panel;
    String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6484483";
    String username="sql6484483";
    String pass="KI1fI29LDc";
    static String col="1";
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url,username,pass);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    HostReddit()
    {
        this.setTitle("Reddit Pixel Art (r/Place)");
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setSize(860,700);
        menuBar = new MenuBar();

        menu = new Menu("Color");

        red = new MenuItem("Red");
        green = new MenuItem("Green");
        blue = new MenuItem("Blue");
        gray = new MenuItem("Grey");
        black = new MenuItem("Black");
        cyan = new MenuItem("Cyan");
        orange = new MenuItem("Orange");
        white = new MenuItem("White");
        skin = new MenuItem("Skin");

        menu.add(red);
        menu.add(green);
        menu.add(blue);
        menu.add(gray);
        menu.add(cyan);
        menu.add(skin);
        menu.add(black);
        menu.add(orange);
        menu.add(white);


        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "black";
            }
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "red";
            }
        });

        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "green";
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "blue";
            }
        });

        gray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "gray";
            }
        });

        cyan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "cyan";
            }
        });

        orange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "orange";
            }
        });

        skin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "skin";
            }
        });
        white.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = "white";
            }
        });



        menuBar.add(menu);
        this.setMenuBar(menuBar);
        for(int i=0;i<buttons.length;i++)
        {
            buttons[i] = new Button(""+(i+1));
            buttons[i].setForeground(Color.WHITE);
            buttons[i].setBackground(Color.WHITE);
        }

        column1();
        column2();
        column3();
        column4();

        for (int i=0;i<buttons.length;i++)
        {
            buttons[i].addActionListener(this);
        }

        for (Button button : buttons) {
            this.add(button);
        }
        LoadTile();

        this.setVisible(true);
    }

    void column4()
    {
        int iter=0;
        int size =10;
        for (int i=900;i<930;i++,iter++)
        {
            buttons[i].setBounds(610+20,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=930;i<960;i++,iter++)
        {
            buttons[i].setBounds(610+40,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=960;i<990;i++,iter++)
        {
            buttons[i].setBounds(610+60,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=990;i<1020;i++,iter++)
        {
            buttons[i].setBounds(610+80,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=1020;i<1050;i++,iter++)
        {
            buttons[i].setBounds(610+100,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=1050;i<1080;i++,iter++)
        {
            buttons[i].setBounds(610+120,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=1080;i<1110;i++,iter++)
        {
            buttons[i].setBounds(610+140,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=1110;i<1140;i++,iter++)
        {
            buttons[i].setBounds(610+160,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=1140;i<1170;i++,iter++)
        {
            buttons[i].setBounds(610+180,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=1170;i<1200;i++,iter++)
        {
            buttons[i].setBounds(610+200,20+30+20*(iter+1),20,20);
        }
    }

    void column3()
    {
        int iter=0;
        for (int i=600;i<630;i++,iter++)
        {
            buttons[i].setBounds(410+20,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=630;i<660;i++,iter++)
        {
            buttons[i].setBounds(410+40,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=660;i<690;i++,iter++)
        {
            buttons[i].setBounds(410+60,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=690;i<720;i++,iter++)
        {
            buttons[i].setBounds(410+80,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=720;i<750;i++,iter++)
        {
            buttons[i].setBounds(410+100,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=750;i<780;i++,iter++)
        {
            buttons[i].setBounds(410+120,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=780;i<810;i++,iter++)
        {
            buttons[i].setBounds(410+140,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=810;i<840;i++,iter++)
        {
            buttons[i].setBounds(410+160,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=840;i<870;i++,iter++)
        {
            buttons[i].setBounds(410+180,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=870;i<900;i++,iter++)
        {
            buttons[i].setBounds(410+200,20+30+20*(iter+1),20,20);
        }

    }

    void column2()
    {
        int iter=0;
        for (int i=300;i<330;i++,iter++)
        {
            buttons[i].setBounds(210+20,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=330;i<360;i++,iter++)
        {
            buttons[i].setBounds(210+40,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=360;i<390;i++,iter++)
        {
            buttons[i].setBounds(210+60,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=390;i<420;i++,iter++)
        {
            buttons[i].setBounds(210+80,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=420;i<450;i++,iter++)
        {
            buttons[i].setBounds(210+100,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=450;i<480;i++,iter++)
        {
            buttons[i].setBounds(210+120,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=480;i<510;i++,iter++)
        {
            buttons[i].setBounds(210+140,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=510;i<540;i++,iter++)
        {
            buttons[i].setBounds(210+160,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=540;i<570;i++,iter++)
        {
            buttons[i].setBounds(210+180,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=570;i<600;i++,iter++)
        {
            buttons[i].setBounds(210+200,20+30+20*(iter+1),20,20);
        }
    }

    void column1()
    {
        int iter=0;
        for (int i=0;i<30;i++,iter++)
        {
            buttons[i].setBounds(20+10,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=30;i<60;i++,iter++)
        {
            buttons[i].setBounds(20+30,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=60;i<90;i++,iter++)
        {
            buttons[i].setBounds(20+50,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=90;i<120;i++,iter++)
        {
            buttons[i].setBounds(20+70,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=120;i<150;i++,iter++)
        {
            buttons[i].setBounds(20+90,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=150;i<180;i++,iter++)
        {
            buttons[i].setBounds(20+110,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=180;i<210;i++,iter++)
        {
            buttons[i].setBounds(20+130,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=210;i<240;i++,iter++)
        {
            buttons[i].setBounds(20+150,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=240;i<270;i++,iter++)
        {
            buttons[i].setBounds(20+170,20+30+20*(iter+1),20,20);
        }
        iter=0;
        for (int i=270;i<300;i++,iter++)
        {
            buttons[i].setBounds(20+190,20+30+20*(iter+1),20,20);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

//        String n = String.valueOf(e.getSource());
//        System.out.println(n);
        int index = Integer.parseInt(e.getActionCommand());
//        System.out.println(index);
        insertTile(index,col);
    }



    void insertTile(int coordinate,String color)
    {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Calendar cal = Calendar.getInstance();
        String time =format1.format(cal.getTime());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {

                Statement statement = connection.createStatement();
                statement.executeUpdate("insert into reddit values('"+coordinate+"','"+color+"','"+time+"');");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        LoadTile();

    }

    void LoadTile()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from reddit order by updatedtime asc;");

                while (resultSet.next())
                {
//                    System.out.println(resultSet.getString(1));
//                    System.out.println(resultSet.getString(2));

                    int i = Integer.parseInt(resultSet.getString(1));

                    String cl = resultSet.getString(2);
                    Color color = Color.white;

                    if (cl.equals("red"))
                    {
                        color = Color.red;
                    }

                    if (cl.equals("blue"))
                    {
                        color = Color.blue;
                    }
                    if (cl.equals("green"))
                    {
                        color = Color.green;
                    }
                    if (cl.equals("gray"))
                    {
                        color = Color.gray;
                    }
                    if (cl.equals("cyan"))
                    {
                        color = Color.cyan;
                    }
                    if (cl.equals("orange"))
                    {
                        color = Color.orange;
                    }
                    if (cl.equals("white"))
                    {
                        color = Color.white;
                    }
                    if (cl.equals("skin"))
                    {
                        color = new Color(210,161,140);
                    }
                    if(cl.equals("black"))
                    {
                        color = Color.black;
                    }




                    buttons[i-1].setBackground(color);
                    buttons[i-1].setForeground(color);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new HostReddit();
    }


}
