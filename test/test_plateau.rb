require './test_helper'
class PlateauTest < Test::Unit::TestCase
  context "A new plateau is assigned" do
    setup do
      @plateau = Plateau.new('1,2','3,4')
    end

    should 'have the correct arguments' do
      assert_equal @plateau.size, [[1,2],[3,4]]
    end
  end
end
