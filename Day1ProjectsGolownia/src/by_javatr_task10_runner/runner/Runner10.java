package by_javatr_task10_runner.runner;
import by_javatr_task10_runner.util.Function;
import print.PrintToConsole;
import scan.Scan;
//—оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с шагом h. 
//–езультат представить в виде таблицы, 
//первый столбец которой Ц значени€ аргумента, второй - соответствующие значени€ функции.
//F(x) = tg (x);
public class Runner10 {
	public static void main(String[] args) {
	double startPositionOfSegment;
	double finishPositionOfSegment;
	double step;
	
	PrintToConsole.print("Enter a  start position of segment:");
	startPositionOfSegment = Scan.getNextDoubleFromConsole();
	PrintToConsole.print("Enter a finish position of segment:");
	finishPositionOfSegment = Scan.getNextDoubleFromConsole();
	PrintToConsole.print("Enter a size of step:");
	step = Scan.getNextDoubleFromConsole();
	
	Function function = new Function();
	function.findFunctionValues(startPositionOfSegment, finishPositionOfSegment, step);
	PrintToConsole.print(function.toString());
	PrintToConsole.print(function.toTable());
	}
}
