package exo_Robot_correction;

enum Bouton {
	ALLUMER, ETEINDRE, AVANCER, TOURNERADROITE, TOURNERAGAUCHE, RECULER;
}

enum Direction {
	GAUCHE,DROITE,HAUT,BAS;
}

public class Robot {
	
	private boolean estAllumer;
	private boolean seDeplace;
	private Point position;
	private Direction direction;
	private Quadrillage quadrillage;
	private int vitesse;
	
	/**
	 * Constructeur par defaut
	 */
	public Robot()
	{
		this.estAllumer = false;
		this.seDeplace = false;
		position = new Point(0,0);
		direction = Direction.HAUT;
		vitesse = 0;
		quadrillage = new Quadrillage(5, -5,5,-5);
	}
	
	/**
	 * Cette methode allume le robot (en appuyant sur le bouton allumer ==> ALLUMER dans enum Bouton)
	 * @return
	 */
	private boolean allumer()
	{
		if(!this.estAllumer)
		{
			this.estAllumer = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	 
	/**
	 * Cette methode eteind le robot (en appuyant sur le bouton eteindre ==> ETEINDRE dans enum Bouton)
	 * @return
	 */
	private boolean eteindre()
	{
		if(this.estAllumer)
		{
			this.vitesse = 0;
			this.seDeplace = false;
			this.estAllumer = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Cette methode diminue la vitesse du robot s'il en marche jusqu'a avoir une vitesse de 0
	 * (a chaque appuie sur le bouton reculer ==> RECULER dans enum bouton)
	 * ou l'arrete si la vitesse = 0
	 * @return
	 */
	
	private boolean diminueVitesse()
	{
		if(this.estAllumer && this.seDeplace)
		{
			if(this.vitesse <= 2 && this.vitesse != 0)
			{
				this.vitesse -= 1;
				if(this.vitesse == 0)
				{
					this.seDeplace = false;
				}
				return true;
			}
			else if(this.vitesse == 0)
			{
				this.seDeplace = false;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	/**
	 * Cette methode fait avancer le robot s'il est allumer et lui fait prendre de la vitesse
	 * (a chaque appuis sur le bouton avancer ==> AVANCER dans enum bouton)
	 * s'il bute au bornes du quadrillage, il s'arrete
	 * @return
	 */
	private boolean avancer()
	{
		if(this.vitesse <= 1)
		{
			this.vitesse += 1;
		}
		if(this.estAllumer)
		{
			if(!this.estPositionValide(this.position))
			{
				this.vitesse = 0;
				this.seDeplace = false;
				return false;
			}
			else
			{
				this.seDeplace = true;
				if(direction == this.direction.HAUT)
				{
					if(this.estPositionValide(new Point(0,this.position.getOrdonnee()+vitesse)))
					{
						this.position.setOrdonnee(this.vitesse);
						return true;
					}
					else
					{
						return false;
					}
				}
				else if (direction == this.direction.DROITE)
				{
					if(this.estPositionValide(new Point(this.position.getAbcsisse()+vitesse,0)))
					{
						this.position.setAbcsisse(this.vitesse);
						return true;
					}
					else
					{
						return false;
					}
				}
				else if (direction == this.direction.BAS)
				{
					if(this.estPositionValide(new Point(0,this.position.getOrdonnee()-vitesse)))
					{
						this.position.setOrdonnee(-vitesse);
						return true;
					}
					else
					{
						return false;
					}
				}
				else if (direction == this.direction.GAUCHE)
				{
					if(this.estPositionValide(new Point(this.position.getAbcsisse()+vitesse,0)))
					{
						this.position.setAbcsisse(-vitesse);
						return true;
					}
					else
					{
						return false;
					}
				}
				return true;
			}
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Methode pour faire tourner a droite le robot 
	 * a chaque appuie sur le bouton droite ==> TOURNEADROITE dans enum bouton
	 * @return
	 */
	
	private boolean tourneADroite()
	{
		if(this.estAllumer)
		{
			if(direction == this.direction.HAUT)
			{
				this.direction = this.direction.DROITE;
				return true;
			}
			else if (direction == this.direction.DROITE)
			{
				this.direction = this.direction.BAS;
				return true;
			}
			else if (direction == this.direction.BAS)
			{
				this.direction = this.direction.GAUCHE;
				return true;
			}
			else if (direction == this.direction.GAUCHE)
			{
				this.direction = this.direction.HAUT;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Methode pour faire tourner a gauche le robot 
	 * a chaque appuie sur le bouton gauche ==> TOURNEAGAUCHE dans enum bouton
	 * @return
	 */
	private boolean tourneAGauche()
	{
		if(this.estAllumer)
		{
			if(direction == this.direction.HAUT)
			{
				this.direction = this.direction.GAUCHE;
				return true;
			}
			else if (direction == this.direction.GAUCHE)
			{
				this.direction = this.direction.BAS;
				return true;
			}
			else if (direction == this.direction.BAS)
			{
				this.direction = this.direction.DROITE;
				return true;
			}
			else if (direction == this.direction.DROITE)
			{
				this.direction = this.direction.HAUT;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Retourne true si la position du robot est valide, false sinon
	 * @param _positionRobot
	 * @return
	 */
	private boolean estPositionValide(Point _positionRobot)
	{
		if(_positionRobot.getAbcsisse() <= quadrillage.getAbcsisseMax()
				&& _positionRobot.getOrdonnee() <= quadrillage.getOrdonneMax()
				&& _positionRobot.getAbcsisse() >= quadrillage.getAbcsisseMin()
				&& _positionRobot.getOrdonnee() >= quadrillage.getOrdonneMin())
		{
			return true;
		}
		return false;
	}
	/**
	 * Methode qui selectionne l'action du robot en fonction du bouton choisi
	 * @param appuiBouton
	 * @return
	 */
	public boolean action(Bouton appuiBouton)
	{
		switch(appuiBouton)
		{
		case ALLUMER:
			this.allumer();
			return true;
		case ETEINDRE:
			this.eteindre();
			return true;
		case AVANCER:
			this.avancer();
			return true;
		case TOURNERADROITE:
			this.tourneADroite();
			return true;
		case TOURNERAGAUCHE:
			this.tourneAGauche();
			return true;
		case RECULER:
			this.diminueVitesse();
			return true;
		default:
			return false;
		}
	}
	/**
	 * Methode qui permet d'afficher les info du robot
	 * @return
	 */
	public String affichageRobotInfo()
	{
		if(this.estAllumer)
		{
			return("Le robot est dans la direction : "+this.direction
					+"\nIl est à la position : \n\tEn abcsisse : "+this.position.getAbcsisse()
					+"\tEn ordonnee : "+this.position.getOrdonnee()
					+"\n\tSa vitesse : "+this.vitesse);
		}
		else
		{
			return ("Le robot est eteint");
		}
	}
}
