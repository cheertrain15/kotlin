fun main(args: Array<String>){
	for(i in 0..50){
		var point: Int = (0..4).random()
		println("$i)")
		for(i in 0..4){
			if(point == i){
				print("*")
			}
			loto6()
		}
		println()
	}
}

class loto6 {
	val result = IntArray(6)
	
	constructor() {
		for(i in 0..result.size-1){
			var selected: Int = (1..43).random()
			while(result.contains(selected)){
				selected = (1..43).random()
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