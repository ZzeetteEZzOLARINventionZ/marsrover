require_relative 'lib/plateau'
require_relative 'lib/direction'
require_relative 'lib/navigator'
require_relative 'lib/rover'
# Plateu Singleton.
plateau = Plateau.new('0,0','2,2')
rover = Rover.new('1 2 N',plateau)
rover.visual = true
rover.command('LMLMLMLMM')
puts rover.inspect
rover = Rover.new('3 3 E',plateau)
rover.visual = true
rover.command('MMRMMRMRRM')
puts rover.inspect

