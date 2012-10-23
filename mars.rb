require_relative 'lib/plateau'
require_relative 'lib/direction'
require_relative 'lib/navigator'
require_relative 'lib/rover'

#Control rover by commandline
=begin
plateau = Plateau.new('0,0','5,5')
rover = Rover.new('1 2 N',plateau)
rover.visual = true
rover.command('LMLMLMLMM')
puts rover.inspect
rover = Rover.new('3 3 E',plateau)
rover.visual = true
rover.command('MMRMMRMRRM')
puts rover.inspect
=end

pla = STDIN.gets().split(' ')
pla = "#{pla[0]},#{pla[1]}"
plateau = Plateau.new('0,0',pla)
pos = STDIN.gets()
rover = Rover.new(pos,plateau)
rover.visual = false
com = STDIN.gets()
rover.command(com)
puts rover.inspect
