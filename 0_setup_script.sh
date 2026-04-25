minikube config set profile kubescape-demo-cluster

minikube start --v=5 --profile=kubescape-demo-cluster \
--driver=podman \
--cni=calico --memory=8192 \
--dns-domain='cluster.local' \
--extra-config=apiserver.authorization-mode=Node,RBAC

minikube ip
