# Tests Logging
# @goal logtest
# @phase validate
class LogTest < Mojo
 def execute
 info "Prints an INFO message"
 error "Prints an ERROR message"
 debug "Prints to the Console"
 end
end
run_mojo LogTest