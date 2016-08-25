puts "Is Jack older than Kevin?"
puts "What is Jack's age?"
jack = gets.chomp
puts "What is Kevin's age?"
kevin = gets.chomp

	if jack < kevin
		puts "Kevin is older than Jack!"
	elsif jack > kevin
		puts "Jack is older than Kevin!"
	else
		puts "They are the same age"
end