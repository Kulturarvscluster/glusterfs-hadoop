
#Must be run as root

SCRIPT_DIR=$(dirname "$(readlink -f -- ${BASH_SOURCE[0]})")

set -e
# mount | grep loop | cut -d' ' -f1 | xargs -r -i sudo umount {}
dnf install glusterfs-server -y

#Open firewall
firewall-cmd --zone=public --add-port=24007-24008/tcp --permanent
firewall-cmd --zone=public --add-port=24009/tcp --permanent

firewall-cmd --zone=public --add-port=24009/tcp --permanent
firewall-cmd --zone=public --add-service=nfs --add-service=samba --add-service=samba-client --permanent

firewall-cmd --zone=public --add-port=111/tcp --add-port=139/tcp --add-port=445/tcp --add-port=965/tcp --add-port=2049/tcp --add-port=38465-38469/tcp --add-port=631/tcp --add-port=111/udp --add-port=963/udp --add-port=49152-49251/tcp --permanent

firewall-cmd --reload

systemctl start glusterd

$SCRIPT_DIR/resources/setup.test.env.sh -w /tmp/gluster0 -v gv0

$SCRIPT_DIR/resources/setup.test.env.sh -w /tmp/gluster1 -v gv1
