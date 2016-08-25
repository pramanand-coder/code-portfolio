students_standing = {}

@student_count = 0

until @student_count > 2 do
	puts "Enter name of student: "
	student_name = gets.chomp

    puts "Enter grade for the student: "
    grades = gets.chomp.to_i

    students_standing[student_name] = grades

    @student_count += 1
end

puts ""

puts students_standing.sort_by {|student, grade| grade}