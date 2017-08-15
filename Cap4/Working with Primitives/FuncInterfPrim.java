import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/*
boolean getAsBoolean()

Functional Interfaces 		# Parameters 	Return Type 	Single Abstract
															Method
----------------------------------------------------------------------------
DoubleSupplier				0				double			getAsDouble
IntSupplier									int				getAsInt
LongSupplier								long			getAsLong

DoubleConsumer				1(double)		void			accept
IntConsumer					1(int)
LongConsumer				1(long)

DoublePredicate				1(double)		boolean			test
IntPredicate				1(int)
IntPredicate				1(long)

DoubleFunction<R>			1(double)		R				apply
IntFunction<R>				1(int)
LongFunction<R>				1(long)

DoubleUnaryOperator			1(double)		double			applyAsDouble
IntUnaryOperator			1(int)			int				applyAsInt
LongUnaryOperator			1(long)			long			applyAsLong

DoubleBinaryOperator		2 (doub,doub)	double			applyAsDouble
IntBinaryOperator			2 (int, int)	int				applyAsInt
LongBinaryOperator			2 (long, long)	long			applyAsLong
##########################################################################

ToDoubleFunction<T>			1 (T)			double			applyAsDouble
ToIntFunction<T>							int				applyAsInt
ToLongFunction<T>							long			applyAsLong

ToDoubleBiFunction<T, U>	2 (T, U)		double			applyAsDouble	
ToIntBiFunction<T, U>						int				applyAsInt
ToLongBiFunction<T, U>						long			applyAsLong

DoubleToIntFunction			1(double)		int				applyAsInt
DoubleToLongFunction		1(double)		long			applyAsLong
IntToDoubleFunction			1(int)			double			applyAsDouble
IntToLongFunction			1(int)			long			applyAsLong
LongToDoubleFunction		1(long)			double			applyAsDouble
LongToIntFunction			1(long)			int				applyAsInt

ObjDoubleConsumer<T>		2 (T, double)	void 			accept
ObjIntConsumer<T>			2 (T, int)
ObjLongConsumer<T>			2 (T, long)
*/

public class FuncInterfPrim{
		
		private static void booleanSupplier() {
			BooleanSupplier b1 = () -> true;
			BooleanSupplier b2 = () -> Math.random() > .5;
			System.out.println(b1.getAsBoolean());
			System.out.println(b2.getAsBoolean());
		}

		public static void main(String...args){
			booleanSupplier();
		}
}