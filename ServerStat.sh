echo "Press Ctrl+Z to terminate the execution of script"
read -p "Enter the time interval in minutes to check server status: " minutes
seconds=$(( $minutes * 60 ))

while true
do
    file="SERVER_STATUS.txt"
    while read line || [[ -n "$line" ]]
    do
        IFS=' '
	    arr=($line)
	    app_name=(${arr[0]})

	    IFS='/'
	    arr1=(${arr[1]})
	    server_down=(${arr1[0]})
	    total_server=(${arr1[1]})

	    IFS=' '
	    up_server=$(( total_server-server_down ))
	    if [ $up_server == 0 ] || [ $up_server == 1 ] 
	    then
		    echo "RED Alert for $app_name"
	    elif [ $up_server -eq $total_server ] 
	    then
		    echo "GREEN Alert for $app_name"
	    else
		    echo "AMBER Alert for $app_name"
	    fi
    done < "$file"
    sleep $seconds
done
