import scala.util.Try
import scala.math.pow


object Question1
{
	def main(args: Array[String]): Unit =
	{
		val x: Double = 42.354562
		val y: Int = 3

		println(f"$x%.2f");
		println(f"${y}%04d");	
	}
}

object Question2
{
	def fact(num: Int): BigInt = 
	{
		var result = 1;
		for(i <- 1 to num)
		{
			result = result * i;
		}
		return result
	}

	def main(args: Array[String]): Unit =
	{
		for(value_in_args <- args)
		{
			if (Try(value_in_args.toInt).isSuccess)
			{
				println(f"Factorial of ${value_in_args} : " + fact(value_in_args.toInt))
			}
			else
			{
				println(f"Factorial of ${value_in_args}: NA")
			}
		}
	}
}


object Question3
{
	def fact(num: Int): BigInt = 
	{
		var result = 1;
		for(i <- 1 to num)
		{
			result = result * i;
		}
		return result
	}

	def main(args: Array[String]): Unit =
	{
		for(value_in_args <- args)
		{
			if(Try(value_in_args.toInt).isSuccess)
			{
				println(f"Factorial of ${value_in_args} : " + fact(value_in_args.toInt))
			}
			else if(Try(value_in_args.toDouble).isSuccess)
			{
				println(f"Factorial of ${value_in_args} : " + fact(value_in_args.toDouble.toInt))
			}
			else
			{
				println(f"Factorial of ${value_in_args}: NA")
			}
		}
	}
}


object Question4
{
	def print_fibb(num: Int): Unit = 
	{
		var num1 = 0;
		var num2 = 1;
		
		for(i <- 1 to num)
		{
			print(num1 + " ");
			var cumulative = num1 + num2;
			num1 = num2;
			num2 = cumulative;
		}
	}
	
	def main(args: Array[String]): Unit =
	{
		print_fibb(10);
	}
}


object Question5A
{
	def print_cube(num: Int): Unit = 
	{
		println(f"${num} -> ${pow(num, 3)}");
	}
	
	def main(args: Array[String]): Unit =
	{
		println("Enter a number to cube");
		val a = scala.io.StdIn.readInt()
		print_cube(a)
	}
}


object Question5B
{
	def main(args: Array[String]): Unit =
	{
		val lambda_cube = (x:Int) => pow(x, 3)
		
		println("Enter a number to cube");
		val a = scala.io.StdIn.readInt()
		println(lambda_cube(a))
	}
}



