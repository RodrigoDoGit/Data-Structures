// Uma classe simples para representar um ponto 2D
class Point{
    int x, y;
    
    Point(){
	x = y = 0;
    }
   
    Point(int x0, int y0){
	x = x0;
	y = y0;
    }

    public String toString(){
	return "(" + x + "," + y + ")";
    }
}

class Rectangle{
    int x1, x2, y1, y2;

    Rectangle(int x1, int y1, int x2, int y2){
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
    }

    Rectangle(Point p1, Point p2){
	x1 = p1.x;
	y1 = p1.y;
	x2 = p2.x;
	y2 = p2.y;
    }

    public int area(){
	return ((x2-x1) * (y2-y1));
    }

    public int perimeter(){
	return ((x2-x1)*2 + (y2-y1)*2);
    }

    public boolean pointInside(Point p){
	if(p.x >= x1 && p.y >= y1 && p.x <= x2 && p.y <= y2)
	    return true;

	else
	    return false;
    }

    public boolean rectangleInside(Rectangle r){
	Point p1 = new Point(r.x1, r.y1);
	Point p2 = new Point(r.x2, r.y2);

	if(pointInside(p1) && pointInside(p2))
	    return true;

	else
	    return false;
    }
}

class ED186{
    public static void main(String[] args){
	Point a = new Point(1,1);
	Point b = new Point(2,2);
	Point c = new Point(3,4);
	Point d = new Point(8,2);
	
	Rectangle amarelo  = new Rectangle(a, c);
	Rectangle laranja  = new Rectangle(2, 3, 9, 6);
	Rectangle verde    = new Rectangle(3, 4, 4, 5);
	Rectangle azul     = new Rectangle(5, 1, 6, 5);
	Rectangle vermelho = new Rectangle(7, 3, 9, 5);
	
	System.out.println("Perimetro do retangulo amarelo = " + amarelo.perimeter()); // 10
	System.out.println("Perimetro do retangulo laranja = " + laranja.perimeter()); // 20
	
	System.out.println("Area do retangulo amarelo = " + amarelo.area()); // 6
	System.out.println("Area do retangulo laranja = " + laranja.area()); // 21                   
      
	System.out.println("Ponto B dentro rectangulo amarelo? " + amarelo.pointInside(b)); // true
	System.out.println("Ponto D dentro rectangulo amarelo? " + amarelo.pointInside(d)); // false
      
	System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));       // true
	System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));         // false
	System.out.println("Retangulo vermelho dentro do laranja? " + laranja.rectangleInside(vermelho)); // true
    }
}
