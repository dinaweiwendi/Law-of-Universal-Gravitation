public class Planet{
   public double xxPos;
   public double yyPos;
   public double xxVel;
   public double yyVel;
   public double mass;
   public String imgFileName;
   public Planet(double xP, double yP, double xV,double yV, double m, String img){
     xxPos=xP;
     yyPos=yP;
     xxVel=xV;
     yyVel=yV;
     mass=m;
     imgFileName=img;

   }
   public Planet(Planet p){
     xxPos=p.xxPos;
     yyPos=p.yyPos;
     xxVel=p.xxVel;
     yyVel=p.yyVel;
     mass=p.mass;
     imgFileName=p.imgFileName;

   }
   public double calcDistance(Planet p){
      double x=this.xxPos-p.xxPos;
      double y=this.yyPos-p.yyPos;
      double distance=x*x+y*y;
      return Math.sqrt(distance);

   }

   public double calcForceExertedBy(Planet p){
      double G=6.67e-11;
      double f = G * this.mass * p.mass/(this.calcDistance(p)*this.calcDistance(p));
      return f;

   }
   public double calcForceExertedByX(Planet p){
      double f=this.calcForceExertedBy(p);
      double fx=f*(p.xxPos-this.xxPos)/this.calcDistance(p);
      return fx;

   }
   public double calcForceExertedByY(Planet p){
      double f=this.calcForceExertedBy(p);
      double fy=f*(p.yyPos-this.yyPos)/this.calcDistance(p);
      return fy;
   }
   public double calcNetForceExertedByX(Planet[] planets){
      double sumX=0;
      int i=0;
      int len=planets.length;
      while(i<len){
        if (this.equals(planets[i])==false){

          sumX=sumX+this.calcForceExertedByX(planets[i]);
        }

        i=i+1;
      }
      return sumX;

   }
   public double calcNetForceExertedByY(Planet[] planets){
      double sumY=0;
      int i=0;
      int len=planets.length;
      while(i<len){
        if (this.equals(planets[i])==false){
          sumY=sumY+this.calcForceExertedByY(planets[i]);
        }

        i=i+1;
      }
      return sumY;
   }
   public void update(double dt, double fX, double fY){
     double aX=fX/this.mass;
     double aY=fY/this.mass;
     this.xxVel=this.xxVel+aX*dt;
     this.yyVel=this.yyVel+aY*dt;
     this.xxPos=this.xxPos+this.xxVel*dt;
     this.yyPos=this.yyPos+this.yyVel*dt;
   }
   public void draw(){
     String imageToDraw = "images/"+this.imgFileName;
     StdDraw.picture(this.xxPos, this.yyPos, imageToDraw);
   }
}
