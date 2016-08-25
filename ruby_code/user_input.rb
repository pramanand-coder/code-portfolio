require_relative("averages.rb")

class Input
	attr_accessor :student_name, :score1, :score2, :score3, :students_and_scores

	def user_input
		@students_and_scores = {}
		counter = 0
		while counter < 100
			puts "Enter student name: "
			@student_name = gets.chomp
			puts "Enter first test score: "
			@score1 = gets.chomp.to_i
			puts "Enter second test score: "
		    @score2 = gets.chomp.to_i 
		    puts "Enter third test score: "
			@score3 = gets.chomp.to_i
			puts "Are you done? "
			@question = gets.chomp

			@students_and_scores[@student_name]	= [@score1, @score2, @score3]

			break if @question == "Yes"
			counter += 1
		end
	end
end


new_input =Input.new
new_input.user_input


new_calculation = Calculator.new
new_calculation.average[new_input.students_and_scores]