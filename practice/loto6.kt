import java.util.Date
import java.time.LocalDateTime

fun main(args: Array<String>){
	val mini = 1063 + 1
	val	l6 = 1455 + 1
	val	l7 = 354 + 1
		
	var todayTimeL7 = l7
	var candidateL7: Int = (1..todayTimeL7).random()
	for(index in 0..todayTimeL7){
		if(index == candidateL7){
			println("Åö7Åö")
			for(i in 0..4){
				loto7()
			}
		}
	}
	
	var todayTimeL6 = l6
	var candidateL6: Int = (1..todayTimeL6).random()
	for(index in 0..todayTimeL6){
		if(index == candidateL6){
			println("\nÅö6Åö")
			for(i in 0..4){
				loto6()
			}
		}
	}
	
	var todayTimeMini = mini
	var candidateMini: Int = (1..todayTimeMini).random()
	for(index in 0..todayTimeMini){
		if(index == candidateMini){
			println("\nÅöminiÅö")
			for(i in 0..4){
				mini()
			}
		}
	}
}

class loto7 {
	val result = IntArray(7)
	
	constructor() {
		for(i in 0..result.size-1){
			var selected: Int = (1..37).random()
			var variation = (-1..1).random()
				selected += variation
			while(result.contains(selected) || selected < 1 || selected > 37){
				selected = (1..37).random()
				variation = (-1..1).random()
				selected += variation
			}
			result[i] = selected
		}
		
		result.sort()
		
		for(i in 0..result.size-1){
			val selectedNumber = result[i]
				print("$selectedNumber ")
		}
		println()
	}
}

class loto6 {
	val result = IntArray(6)
	
	constructor() {
		for(i in 0..result.size-1){
			var selected: Int = (1..43).random()
			var variation = (-1..1).random()
				selected += variation
			while(result.contains(selected) || selected < 1 || selected > 43){
				selected = (1..43).random()
				variation = (-1..1).random()
				selected += variation
			}
			result[i] = selected
		}
		
		result.sort()
		
		for(i in 0..result.size-1){
			val selectedNumber = result[i]
				print("$selectedNumber ")
		}
		println()
	}
}

class mini {
	val result = IntArray(5)
	
	constructor() {
		for(i in 0..result.size-1){
			var selected: Int = (1..31).random()
			var variation = (-1..1).random()
				selected += variation
			while(result.contains(selected) || selected < 1 || selected > 31){
				selected = (1..31).random()
				variation = (-1..1).random()
				selected += variation
			}
			result[i] = selected
		}
		
		result.sort()
		
		for(i in 0..result.size-1){
			val selectedNumber = result[i]
				print("$selectedNumber ")
		}
		println()
	}
}