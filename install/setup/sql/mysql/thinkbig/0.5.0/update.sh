#!/bin/bash

MY_DIR=$(dirname $0)
mysql -f -h $1 -u$2 --password=$3 < ${MY_DIR}/schema-0.5.0-upgrade.sql
mysql -f -h $1 -u$2 --password=$3 < ${MY_DIR}/check_data_job_relationships.sql
echo "Updated to 0.5.0 release";

