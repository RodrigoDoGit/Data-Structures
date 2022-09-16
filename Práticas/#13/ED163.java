import java.util.Arrays;
import java.util.Scanner;

class Team implements Comparable<Team>{
    String name;
    int points;
    int average;

    Team(String n, int v, int e, int d, int gm, int gs){
	name = n;
	points = 3*v + e;
	average = gm - gs;
    }
    
    public String toString(){
	return "(" + name + "," + points + ")";
    }

    public int compareTo(Team t){
	if(points < t.points)
	    return 1;

	if(points > t.points)
	    return -1;

	if(average < t.average)
	    return 1;

	if(average > t.average)
	    return -1;

	return name.compareTo(t.name);
    }
}

public class ED163{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	Team[] v = new Team[N];
	
	for(int i=0; i<N; i++){
	    v[i] = new Team(in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
	    in.nextLine();
	}
	
	Arrays.sort(v);

	for(int i=0; i<N; i++)
	    System.out.println(v[i].name + " " + v[i].points + " " + v[i].average);
    }
}
