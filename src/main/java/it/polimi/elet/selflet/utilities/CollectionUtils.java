package it.polimi.elet.selflet.utilities;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * Utility methods used for collections
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class CollectionUtils {

	public static <T> T randomElement(final Collection<T> collection) {

		checkEmpty(collection);

		List<T> list = Lists.newArrayList(collection);
		Collections.shuffle(list);
		return list.get(0);
	}

	@SuppressWarnings("finally")
	public static <T extends IWeightedItem> T weightedRandomElement(
			Collection<T> collection) {

		try {
			checkWeights(collection);
		} catch (IllegalArgumentException e) {
			removeZeroWeightElements(collection);
		} finally {

			checkEmpty(collection);

			double totalWeight = 0;

			for (T item : collection) {
				totalWeight += item.weight();
			}

			double random = RandomDistributions.randUniform();
			double normalizedCumulative = 0;

			for (T item : collection) {
				normalizedCumulative += item.weight() / totalWeight;
				if (random < normalizedCumulative) {
					return item;
				}
			}
			
			throw new IllegalStateException("Cannot retrieve a random weighted element");
		}
	}
	
	private static <T extends IWeightedItem> void removeZeroWeightElements(Collection<T> collection) {
		Iterator<T> iterator = collection.iterator();
		while(iterator.hasNext()){
			T item = iterator.next();
			if(item.weight() <= 0){
				iterator.remove();
			}
		}
	}

	public static <T> void checkEmpty(final Collection<T> collection) {

		if (collection == null) {
			throw new IllegalArgumentException("Collection is null");
		}

		if (collection.isEmpty()) {
			throw new IllegalArgumentException(
					"Trying to extract a random element from an empty collection");
		}
	}

	public static <T extends IWeightedItem> void checkWeights(
			final Collection<T> collection) {
		for (T item : collection) {
			if (item.weight() <= 0) {
				throw new IllegalArgumentException(
						"Weight of item cannot be zero or negative: " + item);
			}
		}
	}

	/**
	 * Returns 0 if empty iterable
	 * */
	public static double computeAverage(Iterable<Double> iterable) {
		synchronized (iterable) {
			Iterator<Double> iterator = iterable.iterator();
			int numberOfElements = 0;
			double sum = 0;
			while (iterator.hasNext()) {
				Double value = iterator.next();
				// FIXME the point is: why next() return null if the addition of
				// null objects is prevented in the circular fifo queue?
				// Investigate the question...
				if (value == null) {
					iterator.remove();
					System.out.println("null in iterator. sum: " + sum);
				} else {
					sum += value;
					numberOfElements++;
				}
			}
			// System.out.println("sum: " + sum + "; numner of elements: " +
			// numberOfElements);
			if (numberOfElements == 0) {
				return 0;
			}
			return sum / numberOfElements;
		}
	}

}
