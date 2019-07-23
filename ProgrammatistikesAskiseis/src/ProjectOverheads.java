public class ProjectOverheads {
public static double compute_overhead (double budget, int rate){
if (rate == 0)
{if (budget <= 10000) return 0.0;
else return compute_overhead(budget - 10000, 5);}
else if (rate == 5)
{if (budget <= 10000) return budget * 0.05;
else return 10000 * 0.05 + compute_overhead(budget-10000, 10);}
else if (rate == 10)
{if (budget <= 30000) return budget * 0.1;
else return 30000 * 0.1 + compute_overhead(budget-30000, 15);}
else if (rate == 15)
return budget * 0.15;
 return 0;
}
public static void main (String[] args){
int NumProjects;
double budget, overhead, total_overhead=0.0;
do {
System.out.printf("\nEnter number of projects: ");
NumProjects = StdIn.readInt();
} while (NumProjects < 1);
for (int Project = 1; Project <= NumProjects ; Project++){
System.out.printf("\nEnter budget for project no.%3d: ", Project);
budget = StdIn.readDouble();
overhead = compute_overhead(budget, 0);
System.out.printf("\nOverhead for project no.%3d:\t\t%.2f", Project, overhead);
total_overhead = total_overhead + overhead;
} 
System.out.printf("\nOverall overhead:\t\t\t%.2f\n", total_overhead);
}
}