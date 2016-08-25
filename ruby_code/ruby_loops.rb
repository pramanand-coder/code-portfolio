puts "How many fingers am I holding up?"
fingers = rand(10)

5.times do
	fingers_guess = gets. chomp

	if fingers_guess == fingers
		puts "Awesome! You are the winner!"
	else
		puts "guess again!"
	end
end

puts "I gave you five stinkin' tries and you couldn't guess this!"