penny_collection = []

 |5.times do
 	puts "Did you find a penny?"
 	penny = gets.chomp

 	if penny == "yes"
 		penny_collection << 1
 	else
 		puts "I'm so sorry you did not find a penny today"
 	end
 end

 puts penny_collection.length