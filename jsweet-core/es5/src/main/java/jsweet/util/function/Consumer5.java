package jsweet.util.function;

/**
 * Represents an operation that accepts 5 input arguments and returns no result.
 */
@FunctionalInterface
public interface Consumer5<T1, T2, T3, T4, T5> {

	/**
	 * Performs this operation on the given arguments.
	 */
	void apply(T1 p1, T2 p2, T3 p3, T4 p4, T5 p5);

}