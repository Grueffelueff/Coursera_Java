package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<A extends Aggregator>{
	A aggregator;
	String filepath;
	
	
	public AggregatorProcessor(A aggregator, String filepath) {
		super();
		this.aggregator = aggregator;
		this.filepath = filepath;
	}


	public double runAggregator(int rownum) {
		double result = 0;
		
		StockFileReader reader = new StockFileReader(filepath);
		try {
			List<String> lines = reader.readFileData();
//			System.out.println(lines);
			//for everyline, find correct thing
			for (String line: lines) {
				String [] things = line.split(",");
				double thing = Double.valueOf(things[rownum-1]);
				aggregator.add(thing);
			}
//			System.out.println(aggregator.getValues());
			result = aggregator.calculate();
			
			
		} catch (IOException e) {
			System.out.println("Can't read data... to bad...");
//			e.printStackTrace();
		}
		
		return result;
		
	}
	
}
