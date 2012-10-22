require './test_helper'
class RoverTest < Test::Unit::TestCase
  context "A Rover gets dropped" do
    should "complete the course one" do
      plateau = Plateau.new('0,0','5,5')
      rover = Rover.new('1 2 N',plateau)
      rover.visual = false
      assert rover.navigator.pos_x == 1 and rover.navigator.pos_y == 2 and rover.navigator.direction == 'N'
      rover.command('LMLMLMLMM')
      assert_equal rover.inspect, {:x=>1, :y=>3, :d=>"N"}
    end
    should "complete the course two" do
      plateau = Plateau.new('0,0','3,3')
      rover = Rover.new('3 3 E',plateau)
      rover.visual = false
      assert rover.navigator.pos_x == 3 and rover.navigator.pos_y == 3 and rover.navigator.direction == 'E'
      rover.command('MMRMMRMRRM')
      assert_equal rover.inspect, {:x=>5, :y=>1, :d=>"E"}
    end
  end
end
