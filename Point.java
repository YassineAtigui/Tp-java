import java.lang.Math;
public class Point{

	private Double x;
	private Double y;

	// Constructeur par défaut qui initialise les coordonnées du point à (0.0, 0.0).
	public Point(){
		this.x =0.0;
		this.y =0.0;
	}

	// Constructeur qui prend des valeurs x et y pour initialiser les coordonnées du point.
	public Point(Double x,Double y) {
		this.x = x;
		this.y = y;
	}

	//Modifie la coordonnée x du point.
	public void setX(Double x){ 
		this.x= x;
	}

	//Modifie la coordonnée y du point.
	public void setY(Double y){
		this.y=y;
	}

	//Récupère la coordonnée x du point.
	public Double getX(){
		return x;
	}

	//Récupère la coordonnée y du point.
	public Double getY(){
		return y;
	}

	//Déplace le point horizontalement en ajoutant nbr à sa coordonnée x.
	public void deplacerX(Double nbr){
		this.x += nbr;
	}

	//Déplace le point verticalement en ajoutant nbr à sa coordonnée y.
	public void deplacerY(Double nbr){
		this.y += nbr;
	}

	//Réinitialise les coordonnées du point à (0.0, 0.0).
	public void reset(){
		this.x=0.0;
		this.y=0.0;
	}

	// Calcule la distance entre le point actuel et un autre point b.
	public double distance (Point b){
		Double dx = Math.pow((this.x - b.getX()),2) ;
		Double dy = Math.pow((this.y - b.getY()),2) ;
		return Math.sqrt(dx + dy) ;

	}

	// Méthode statique qui calcule la distance entre deux points.
	public static double distance (Point a, Point b){
		Double dx = Math.pow((a.getX() - b.getX()),2) ;
		Double dy = Math.pow((a.getY() - b.getY()),2) ;
		return Math.sqrt(dx + dy) ;

	}
	
	//equals2(Point a) : Cette méthode prend un objet Point en tant que paramètre.
    //Elle compare les coordonnées x et y du point actuel (this) avec les coordonnées du point passé en paramètre (a).
	
	public boolean equals2(Point a){
		return (this.x==a.x && this.y==a.y);
	}
	
	//equals3(Object a) : Cette méthode prend un objet de type Object en tant que paramètre. Elle est généralement utilisée pour comparer l'égalité avec des objets d'autres types.
	//Elle vérifie si l'objet passé en paramètre peut être converti en un objet Point, puis compare les coordonnées x et y du point actuel (this) avec les coordonnées du point résultant de la conversion.
	
	public boolean equals3(Object a){
		return (this.x == ((Point)a).x && this.y == ((Point)a).y);
	}

	//toString() : Retourne une représentation textuelle du point sous la forme d'une chaîne de caractères "(x, y)".
	public String toString(){
		return "("+ x +" , "+ y + ")";
	}

	// Constructeur copie
    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }
}