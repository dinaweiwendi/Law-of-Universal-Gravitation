public class NBody{
    public static double readRadius(String args){
        In in=new In(args);
        int N=in.readInt();
        double radius=in.readDouble();
        return radius;
    }
    public static Planet[] readPlanets(String args){
      In in=new In(args);
      int N=in.readInt();
      double radius=in.readDouble();
      int i=0;
      Planet[] planets=new Planet[N];
      while(i<N){
        double xxPos=in.readDouble();
        double yyPos=in.readDouble();
        double xxVel=in.readDouble();
        double yyVel=in.readDouble();
        double mass=in.readDouble();
        String image=in.readString();
        planets[i]=new Planet(xxPos, yyPos, xxVel, yyVel, mass, image);
        i=i+1;

      }
      return planets;
    }

    public static void main(String[] args){
        double T= Double.parseDouble(args[0]);
        double dt=Double.parseDouble(args[1]);
        String filename = args[2];
        double r=readRadius(filename);
        Planet[] planets=readPlanets(filename);
        String imageToDraw = "images/starfield.jpg";
        StdDraw.setScale(-r, r);
        StdDraw.clear();
        StdDraw.picture(0, 0, imageToDraw);
        StdDraw.show();

        int j = 0;
        int l = planets.length;
        while(j<l){
          planets[j].draw();
          j=j+1;
        }
        StdDraw.show();

        StdDraw.enableDoubleBuffering();
        double time = 0;
        while(time<T){
          int num=0;
          double[] XForces= new double[l];
          double[] YForces= new double[l];
          while(num<l){
              XForces[num]=planets[num].calcNetForceExertedByX(planets);
              YForces[num]=planets[num].calcNetForceExertedByY(planets);
              num=num+1;
        }
        num=0;
        while(num<l){
          planets[num].update(dt, XForces[num], YForces[num]);
          num=num+1;
        }
        StdDraw.setScale(-r, r);
        StdDraw.clear();
        StdDraw.picture(0, 0, imageToDraw);
        j = 0;
        while(j<l){
          planets[j].draw();
          j=j+1;
        }
        StdDraw.show();
        StdDraw.pause(10);
        time=time+dt;
        }
        StdOut.printf("%d\n", planets.length);
        StdOut.printf("%.2e\n", r);
        for (int i = 0; i < planets.length; i++) {
          StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                  planets[i].xxPos, planets[i].yyPos, planets[i].xxVel,
                  planets[i].yyVel, planets[i].mass, planets[i].imgFileName);
                }
    }
}
