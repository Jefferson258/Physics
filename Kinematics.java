import java.util.*;
import java.text.*;

public class Kinematics
{
    public static void main(String[] args)
    {
        double accel, disp, vf, vi, time;
        NumberFormat formatter = new DecimalFormat("#0.000");     
        String solve = new String();
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a kinematics program, enter your variables");
        System.out.println("Enter acceleration (enter 999 if you do not have it)");
        accel = scan.nextInt();
        System.out.println("Enter time (enter 999 if you do not have it)");
        time = scan.nextInt();
        System.out.println("Enter vf (enter 999 if you do not have it)");
        vf = scan.nextInt();
        System.out.println("Enter vi (enter 999 if you do not have it)");
        vi = scan.nextInt();
        System.out.println("Enter displacement (enter 999 if you do not have it)");
        disp = scan.nextInt();
        System.out.println("What do you want to solve for? Enter acceleration, time, vf, vi, displacement");
        solve = scanner.nextLine();
        if(solve.equals("acceleration"))
        {
            if(vf == 999)
                accel = (disp - vi * time) / (.5 * time * time);
            else if(time == 999)
                accel = (vf * vf - vi * vi)/(2 * disp);
            System.out.println(formatter.format(accel) + " m/s^2");
        }
        else if(solve.equals("time"))
        {
            if(vf == 999)
            {
                time = (-1 * vi + Math.sqrt(vi * vi + 2 * accel * disp))/accel;
                Math.abs(time);
            }
            else if(disp == 999)
                time = (vf- vi)/accel;
            System.out.println(formatter.format(time) + " s");
        }
        else if(solve.equals("vf"))
        {
            if(time == 999)
                vf = Math.sqrt(vi * vi + 2 * accel * disp);
            else if(disp == 999)
                vf = vi + accel * time;
            System.out.println(formatter.format(vf) + " m/s");
        }
        else if(solve.equals("vi"))
        {
            if(disp == 999)
                vi = vf - accel * time;
            else if(time == 999)
                vi = Math.sqrt(vf * vf - 2 * accel * disp);
            System.out.println(formatter.format(vi) + " m/s");
        }
        else if(solve.equals("displacement"))
        {
            if(time == 999)
                disp = (vf * vf - vi * vi)/(2 * accel);
            else if(vf == 999)
                disp = .5 * accel * time * time + vi * time;
            System.out.println(formatter.format(disp) + " m");
        }
    }
}