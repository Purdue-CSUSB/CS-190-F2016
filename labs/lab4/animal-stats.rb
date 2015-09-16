# copy and paste your array here!!!
animals = ['ntaoehu', 'enothui']

# prints the average length of each animal string
def average_length arr
  # get how many animals there are
  animal_count = arr.length

  # get the total number of letters in the array
  letter_count = arr.collect(&:length).reduce(:+)

  # find the average animal word length
  average = letter_count / animal_count

  puts "There are #{animal_count} animals with an average letter count of #{average}." 
end

# prints how many animals there are beginning with each letter in the alphabet
def beginning_letter_counts arr
  # create a new hash, for which each value will be initialized to zero
  counts = Hash.new 0

  # increment each letter key-value pair for each animal with corresponding letter
  arr.each{|animal| counts[animal[0]] += 1}

  # prepare a printable string
  count_str = counts.to_s.gsub(", ", "\n")[1..-2]

  puts "Here are the beginning letter frequency of all of the animals:\n#{count_str}"
end

average_length animals
beginning_letter_counts animals
