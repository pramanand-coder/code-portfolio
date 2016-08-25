players_hash = {}

#2.times do
puts "Enter the name of a ball player: "
name = gets.chomp

puts"Enter the position of the player: "
position = gets.chomp

players_hash [name] = position
#end
#comments show possible loop for multiple entries


puts"The player you mentioned is: "
players_hash.each do |name, position|
	puts "#{name} => #{position}"
end