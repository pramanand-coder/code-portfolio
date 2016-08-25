puts "Enter the name of a Baseball player: "
ball_player = gets.chomp

players_hash = {"David Ortiz" => "DH", "Derek Jeter" => "Shortstop"}

puts players_hash[ball_player]